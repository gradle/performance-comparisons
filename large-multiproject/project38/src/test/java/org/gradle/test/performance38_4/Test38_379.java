package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_379 {
    private final Production38_379 production = new Production38_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}