package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_307 {
    private final Production20_307 production = new Production20_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}