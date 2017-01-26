package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_192 {
    private final Production38_192 production = new Production38_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}