package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_389 {
    private final Production49_389 production = new Production49_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}