package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_175 {
    private final Production38_175 production = new Production38_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}