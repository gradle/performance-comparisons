package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_285 {
    private final Production49_285 production = new Production49_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}