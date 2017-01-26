package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_34 {
    private final Production38_34 production = new Production38_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}