package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_254 {
    private final Production49_254 production = new Production49_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}