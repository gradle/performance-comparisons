package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_345 {
    private final Production49_345 production = new Production49_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}