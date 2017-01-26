package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_174 {
    private final Production38_174 production = new Production38_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}