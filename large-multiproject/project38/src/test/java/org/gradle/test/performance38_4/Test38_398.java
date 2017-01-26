package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_398 {
    private final Production38_398 production = new Production38_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}