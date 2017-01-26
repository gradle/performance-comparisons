package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_15 {
    private final Production16_15 production = new Production16_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}