package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_303 {
    private final Production20_303 production = new Production20_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}