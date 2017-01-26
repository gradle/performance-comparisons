package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_401 {
    private final Production38_401 production = new Production38_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}