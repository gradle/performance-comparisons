package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_405 {
    private final Production20_405 production = new Production20_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}