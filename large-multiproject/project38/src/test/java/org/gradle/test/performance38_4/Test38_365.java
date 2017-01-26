package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_365 {
    private final Production38_365 production = new Production38_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}