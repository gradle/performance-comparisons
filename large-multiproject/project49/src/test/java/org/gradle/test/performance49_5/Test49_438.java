package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_438 {
    private final Production49_438 production = new Production49_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}