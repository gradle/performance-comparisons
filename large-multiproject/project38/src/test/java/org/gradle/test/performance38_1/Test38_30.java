package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_30 {
    private final Production38_30 production = new Production38_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}