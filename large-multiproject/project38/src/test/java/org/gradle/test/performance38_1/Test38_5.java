package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_5 {
    private final Production38_5 production = new Production38_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}