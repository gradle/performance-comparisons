package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_26 {
    private final Production38_26 production = new Production38_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}