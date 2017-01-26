package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_9 {
    private final Production38_9 production = new Production38_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}