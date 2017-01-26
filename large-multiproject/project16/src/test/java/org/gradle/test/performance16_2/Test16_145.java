package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_145 {
    private final Production16_145 production = new Production16_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}