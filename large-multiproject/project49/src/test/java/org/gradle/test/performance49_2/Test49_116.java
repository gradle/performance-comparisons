package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_116 {
    private final Production49_116 production = new Production49_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}