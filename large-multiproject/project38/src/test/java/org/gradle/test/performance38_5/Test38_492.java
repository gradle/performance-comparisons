package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_492 {
    private final Production38_492 production = new Production38_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}