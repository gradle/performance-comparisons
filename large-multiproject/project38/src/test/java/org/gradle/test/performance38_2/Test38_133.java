package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_133 {
    private final Production38_133 production = new Production38_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}