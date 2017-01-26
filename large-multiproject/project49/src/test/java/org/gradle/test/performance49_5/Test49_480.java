package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_480 {
    private final Production49_480 production = new Production49_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}