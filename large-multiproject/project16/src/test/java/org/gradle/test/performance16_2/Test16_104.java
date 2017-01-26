package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_104 {
    private final Production16_104 production = new Production16_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}