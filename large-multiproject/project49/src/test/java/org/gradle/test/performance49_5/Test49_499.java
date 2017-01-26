package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_499 {
    private final Production49_499 production = new Production49_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}