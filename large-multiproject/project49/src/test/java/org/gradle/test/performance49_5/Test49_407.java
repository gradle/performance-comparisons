package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_407 {
    private final Production49_407 production = new Production49_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}