package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_324 {
    private final Production38_324 production = new Production38_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}