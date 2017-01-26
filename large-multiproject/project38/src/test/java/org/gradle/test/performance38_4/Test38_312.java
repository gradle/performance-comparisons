package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_312 {
    private final Production38_312 production = new Production38_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}