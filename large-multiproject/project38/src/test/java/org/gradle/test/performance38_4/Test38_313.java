package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_313 {
    private final Production38_313 production = new Production38_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}