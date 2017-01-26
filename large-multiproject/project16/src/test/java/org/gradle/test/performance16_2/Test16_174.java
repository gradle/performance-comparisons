package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_174 {
    private final Production16_174 production = new Production16_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}