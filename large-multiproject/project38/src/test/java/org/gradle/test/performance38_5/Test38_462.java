package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_462 {
    private final Production38_462 production = new Production38_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}