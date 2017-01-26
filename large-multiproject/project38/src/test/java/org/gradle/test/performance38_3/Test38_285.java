package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_285 {
    private final Production38_285 production = new Production38_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}