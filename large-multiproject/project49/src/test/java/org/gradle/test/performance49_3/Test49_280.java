package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_280 {
    private final Production49_280 production = new Production49_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}