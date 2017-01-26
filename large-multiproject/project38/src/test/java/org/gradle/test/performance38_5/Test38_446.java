package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_446 {
    private final Production38_446 production = new Production38_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}