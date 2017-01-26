package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_226 {
    private final Production49_226 production = new Production49_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}