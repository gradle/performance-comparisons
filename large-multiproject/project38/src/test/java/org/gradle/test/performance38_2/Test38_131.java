package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_131 {
    private final Production38_131 production = new Production38_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}