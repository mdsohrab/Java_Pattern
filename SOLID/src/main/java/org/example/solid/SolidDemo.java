package org.example.solid;

import org.example.solid.dip.DipDemo;
import org.example.solid.isp.IspDemo;
import org.example.solid.lsp.LspDemo;
import org.example.solid.ocp.OcpDemo;
import org.example.solid.srp.SrpDemo;

/**
 * Runs every SOLID example (before vs after) in one go.
 */
public class SolidDemo {

    public static void main(String[] args) {
        SrpDemo.main(args);
        System.out.println();
        OcpDemo.main(args);
        System.out.println();
        LspDemo.main(args);
        System.out.println();
        IspDemo.main(args);
        System.out.println();
        DipDemo.main(args);
    }
}
