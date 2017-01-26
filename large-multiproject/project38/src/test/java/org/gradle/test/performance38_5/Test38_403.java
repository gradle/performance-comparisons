package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_403 {
    private final Production38_403 production = new Production38_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}