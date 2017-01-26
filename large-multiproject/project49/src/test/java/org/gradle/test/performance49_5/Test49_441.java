package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_441 {
    private final Production49_441 production = new Production49_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}