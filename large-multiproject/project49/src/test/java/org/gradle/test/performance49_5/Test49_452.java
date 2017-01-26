package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_452 {
    private final Production49_452 production = new Production49_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}