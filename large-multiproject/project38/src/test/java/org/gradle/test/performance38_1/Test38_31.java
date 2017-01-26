package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_31 {
    private final Production38_31 production = new Production38_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}