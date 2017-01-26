package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_250 {
    private final Production49_250 production = new Production49_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}