package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_15 {
    private final Production5_15 production = new Production5_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}