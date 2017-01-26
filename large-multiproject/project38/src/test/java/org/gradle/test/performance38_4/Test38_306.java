package org.gradle.test.performance38_4;

import static org.junit.Assert.*;

public class Test38_306 {
    private final Production38_306 production = new Production38_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}