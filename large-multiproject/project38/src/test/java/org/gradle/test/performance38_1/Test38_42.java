package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_42 {
    private final Production38_42 production = new Production38_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}