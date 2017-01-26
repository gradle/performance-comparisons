package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_271 {
    private final Production49_271 production = new Production49_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}