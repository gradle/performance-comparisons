package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_310 {
    private final Production38_310 production = new Production38_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}