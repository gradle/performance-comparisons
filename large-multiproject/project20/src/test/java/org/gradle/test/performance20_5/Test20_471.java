package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_471 {
    private final Production20_471 production = new Production20_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}