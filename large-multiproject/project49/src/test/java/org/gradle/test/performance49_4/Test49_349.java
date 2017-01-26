package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_349 {
    private final Production49_349 production = new Production49_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}