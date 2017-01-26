package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_486 {
    private final Production38_486 production = new Production38_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}