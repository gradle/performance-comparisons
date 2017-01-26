package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_303 {
    private final Production5_303 production = new Production5_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}