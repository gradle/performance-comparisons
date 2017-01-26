package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_421 {
    private final Production20_421 production = new Production20_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}