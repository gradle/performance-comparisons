package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_185 {
    private final Production49_185 production = new Production49_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}