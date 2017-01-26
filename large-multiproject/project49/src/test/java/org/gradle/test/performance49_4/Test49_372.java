package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_372 {
    private final Production49_372 production = new Production49_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}