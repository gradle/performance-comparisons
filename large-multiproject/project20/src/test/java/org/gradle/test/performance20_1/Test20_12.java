package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_12 {
    private final Production20_12 production = new Production20_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}