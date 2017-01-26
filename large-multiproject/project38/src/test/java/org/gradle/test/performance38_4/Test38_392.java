package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_392 {
    private final Production38_392 production = new Production38_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}