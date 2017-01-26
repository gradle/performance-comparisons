package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_483 {
    private final Production49_483 production = new Production49_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}