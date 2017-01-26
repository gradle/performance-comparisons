package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_500 {
    private final Production35_500 production = new Production35_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}