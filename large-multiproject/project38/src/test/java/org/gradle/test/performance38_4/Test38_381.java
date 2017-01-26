package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_381 {
    private final Production38_381 production = new Production38_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}