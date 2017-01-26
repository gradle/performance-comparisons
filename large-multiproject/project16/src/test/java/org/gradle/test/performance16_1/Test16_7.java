package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_7 {
    private final Production16_7 production = new Production16_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}