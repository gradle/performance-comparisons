package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_160 {
    private final Production49_160 production = new Production49_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}