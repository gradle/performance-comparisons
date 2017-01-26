package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_423 {
    private final Production30_423 production = new Production30_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}