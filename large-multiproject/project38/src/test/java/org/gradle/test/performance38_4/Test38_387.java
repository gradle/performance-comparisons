package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_387 {
    private final Production38_387 production = new Production38_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}