package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_70 {
    private final Production38_70 production = new Production38_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}