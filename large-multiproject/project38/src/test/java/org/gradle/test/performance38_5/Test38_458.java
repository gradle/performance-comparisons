package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_458 {
    private final Production38_458 production = new Production38_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}