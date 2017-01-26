package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_81 {
    private final Production38_81 production = new Production38_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}