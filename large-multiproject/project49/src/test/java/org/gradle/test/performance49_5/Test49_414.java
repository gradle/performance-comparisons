package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_414 {
    private final Production49_414 production = new Production49_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}