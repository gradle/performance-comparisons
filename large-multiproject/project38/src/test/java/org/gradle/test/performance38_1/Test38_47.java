package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_47 {
    private final Production38_47 production = new Production38_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}