package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_239 {
    private final Production38_239 production = new Production38_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}