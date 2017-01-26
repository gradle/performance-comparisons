package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_321 {
    private final Production38_321 production = new Production38_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}