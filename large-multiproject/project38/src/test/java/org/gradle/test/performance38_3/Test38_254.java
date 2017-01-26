package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_254 {
    private final Production38_254 production = new Production38_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}