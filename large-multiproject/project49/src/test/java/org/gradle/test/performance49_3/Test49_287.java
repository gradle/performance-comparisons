package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_287 {
    private final Production49_287 production = new Production49_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}