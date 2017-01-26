package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_28 {
    private final Production38_28 production = new Production38_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}