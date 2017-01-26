package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_341 {
    private final Production49_341 production = new Production49_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}