package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_328 {
    private final Production49_328 production = new Production49_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}