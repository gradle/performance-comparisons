package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_443 {
    private final Production49_443 production = new Production49_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}