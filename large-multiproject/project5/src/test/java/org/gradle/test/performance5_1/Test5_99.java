package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_99 {
    private final Production5_99 production = new Production5_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}