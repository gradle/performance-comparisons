package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_18 {
    private final Production38_18 production = new Production38_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}