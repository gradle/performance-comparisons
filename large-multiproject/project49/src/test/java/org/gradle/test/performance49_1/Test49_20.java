package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_20 {
    private final Production49_20 production = new Production49_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}