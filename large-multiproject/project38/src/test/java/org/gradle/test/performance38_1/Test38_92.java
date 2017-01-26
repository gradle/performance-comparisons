package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_92 {
    private final Production38_92 production = new Production38_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}