package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_275 {
    private final Production49_275 production = new Production49_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}