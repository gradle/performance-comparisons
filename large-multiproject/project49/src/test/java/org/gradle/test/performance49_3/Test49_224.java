package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_224 {
    private final Production49_224 production = new Production49_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}