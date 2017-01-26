package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_37 {
    private final Production38_37 production = new Production38_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}