package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_304 {
    private final Production20_304 production = new Production20_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}