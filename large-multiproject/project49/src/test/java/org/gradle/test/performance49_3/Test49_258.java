package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_258 {
    private final Production49_258 production = new Production49_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}