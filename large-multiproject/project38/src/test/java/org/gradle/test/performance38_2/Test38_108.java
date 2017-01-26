package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_108 {
    private final Production38_108 production = new Production38_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}