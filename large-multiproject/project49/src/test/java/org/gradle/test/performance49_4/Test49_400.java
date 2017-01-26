package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_400 {
    private final Production49_400 production = new Production49_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}