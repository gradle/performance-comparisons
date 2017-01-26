package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_265 {
    private final Production38_265 production = new Production38_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}