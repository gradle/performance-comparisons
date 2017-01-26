package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_481 {
    private final Production16_481 production = new Production16_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}