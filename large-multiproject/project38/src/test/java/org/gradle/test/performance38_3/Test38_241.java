package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_241 {
    private final Production38_241 production = new Production38_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}