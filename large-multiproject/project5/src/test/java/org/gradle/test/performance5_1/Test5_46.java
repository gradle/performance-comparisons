package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_46 {
    private final Production5_46 production = new Production5_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}