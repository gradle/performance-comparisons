package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_33 {
    private final Production38_33 production = new Production38_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}