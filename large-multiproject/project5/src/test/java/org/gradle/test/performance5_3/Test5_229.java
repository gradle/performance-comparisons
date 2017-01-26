package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_229 {
    private final Production5_229 production = new Production5_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}