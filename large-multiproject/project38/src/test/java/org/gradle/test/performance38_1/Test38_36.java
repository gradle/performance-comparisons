package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_36 {
    private final Production38_36 production = new Production38_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}