package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_25 {
    private final Production38_25 production = new Production38_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}