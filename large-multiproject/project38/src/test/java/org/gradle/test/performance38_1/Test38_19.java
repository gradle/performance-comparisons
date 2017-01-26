package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_19 {
    private final Production38_19 production = new Production38_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}