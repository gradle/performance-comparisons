package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_95 {
    private final Production38_95 production = new Production38_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}