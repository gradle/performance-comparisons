package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_106 {
    private final Production38_106 production = new Production38_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}