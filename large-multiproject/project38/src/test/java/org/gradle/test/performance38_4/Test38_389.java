package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_389 {
    private final Production38_389 production = new Production38_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}