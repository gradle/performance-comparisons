package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_473 {
    private final Production38_473 production = new Production38_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}