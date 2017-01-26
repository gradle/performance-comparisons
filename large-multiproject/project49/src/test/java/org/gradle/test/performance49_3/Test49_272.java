package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_272 {
    private final Production49_272 production = new Production49_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}