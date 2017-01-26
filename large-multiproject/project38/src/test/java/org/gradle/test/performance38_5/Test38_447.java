package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_447 {
    private final Production38_447 production = new Production38_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}