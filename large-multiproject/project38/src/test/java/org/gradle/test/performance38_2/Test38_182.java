package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_182 {
    private final Production38_182 production = new Production38_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}