package org.gradle.test.performance38_1;

import static org.junit.Assert.*;

public class Test38_48 {
    private final Production38_48 production = new Production38_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}