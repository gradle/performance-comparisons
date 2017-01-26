package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_289 {
    private final Production5_289 production = new Production5_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}