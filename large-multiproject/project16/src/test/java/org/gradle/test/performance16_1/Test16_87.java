package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_87 {
    private final Production16_87 production = new Production16_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}