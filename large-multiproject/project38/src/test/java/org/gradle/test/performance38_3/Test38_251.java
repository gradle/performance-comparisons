package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_251 {
    private final Production38_251 production = new Production38_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}