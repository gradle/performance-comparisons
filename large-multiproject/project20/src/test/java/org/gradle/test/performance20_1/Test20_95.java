package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_95 {
    private final Production20_95 production = new Production20_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}