package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_285 {
    private final Production74_285 production = new Production74_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}