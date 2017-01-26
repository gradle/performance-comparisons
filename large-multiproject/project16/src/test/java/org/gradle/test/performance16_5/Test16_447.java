package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_447 {
    private final Production16_447 production = new Production16_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}