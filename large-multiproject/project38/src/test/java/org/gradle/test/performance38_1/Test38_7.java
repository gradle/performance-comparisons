package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_7 {
    private final Production38_7 production = new Production38_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}