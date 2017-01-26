package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_24 {
    private final Production49_24 production = new Production49_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}