package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_113 {
    private final Production38_113 production = new Production38_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}