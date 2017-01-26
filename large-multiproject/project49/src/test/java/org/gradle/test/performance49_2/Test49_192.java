package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_192 {
    private final Production49_192 production = new Production49_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}