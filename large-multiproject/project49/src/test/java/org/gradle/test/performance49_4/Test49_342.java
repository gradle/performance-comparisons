package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_342 {
    private final Production49_342 production = new Production49_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}