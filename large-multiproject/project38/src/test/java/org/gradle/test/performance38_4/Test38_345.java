package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_345 {
    private final Production38_345 production = new Production38_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}