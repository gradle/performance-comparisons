package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_238 {
    private final Production38_238 production = new Production38_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}