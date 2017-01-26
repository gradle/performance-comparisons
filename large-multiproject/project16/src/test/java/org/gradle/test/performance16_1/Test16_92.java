package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_92 {
    private final Production16_92 production = new Production16_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}