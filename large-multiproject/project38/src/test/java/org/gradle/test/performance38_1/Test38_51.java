package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_51 {
    private final Production38_51 production = new Production38_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}