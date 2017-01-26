package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_173 {
    private final Production16_173 production = new Production16_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}