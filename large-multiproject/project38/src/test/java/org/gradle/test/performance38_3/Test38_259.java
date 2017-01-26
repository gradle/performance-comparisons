package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_259 {
    private final Production38_259 production = new Production38_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}