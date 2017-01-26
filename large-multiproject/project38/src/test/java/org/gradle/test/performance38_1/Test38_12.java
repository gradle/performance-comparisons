package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_12 {
    private final Production38_12 production = new Production38_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}