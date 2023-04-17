/*Anthony Zaccaria
 * Homework M-1
 * CMSCI 256
 * 4/15/23
 * This is my own original work
 */

public class ThreeNames implements Biggest, Comparable<ThreeNames> {
    private String[] list;
    private boolean[] occupied = { false, false, false };
    
    public ThreeNames() {
        this.list = new String[3];
        list[0] = list[1] = list[2] = "";
    }
    
    public String[] getList() {
        return list;
    }

    public void assign(int pos, String name) {
        this.list[pos] = name;
        this.occupied[pos] = true;
    }
    public boolean validIndex(int pos) {
        return pos >= 0 && pos < 3;
    }
    public boolean notEmpty() {
        return !this.occupied[0] && !this.occupied[1] && !this.occupied[2];
    }
    public double max() {
        int len1 = this.list[0].length();
        int len2 = this.list[1].length();
        int len3 = this.list[2].length();
        return (double) Math.max(Math.max(len1, len2), len3);
    }
    @Override
    public String toString() {
        // String out = "---";
        String out = "";
        for (int i = 0; i < 3; i++) {
            out += i + ":";
            if (this.occupied[i])
                out += String.format("%-10s ", this.list[i]) + " ";
            else
                out += String.format("%-10s ", "----------") + " ";
            }
        return out;
        }

    @Override
    public int compareTo(ThreeNames o) {
        int num=0;
        if (list[0].equals(o.getList()[0])){
            if (!list[1].equals(o.getList()[1])){
                return list[1].compareTo(o.getList()[1]);
            }
            }
            else 
            {
                return list[2].compareTo(o.getList()[2]);
            }
            return num;
        }

        public boolean equals(ThreeNames o) {
            return (list[0].equals(o.getList()[0])&&list[1].equals(o.getList()[1])&&list[2].equals(o.getList()[2]));
        }
    }
    
    
