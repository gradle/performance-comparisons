package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_163 {
    private final Production16_163 production = new Production16_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}