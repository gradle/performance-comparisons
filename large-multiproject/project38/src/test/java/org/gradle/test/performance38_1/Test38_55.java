package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_55 {
    private final Production38_55 production = new Production38_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}