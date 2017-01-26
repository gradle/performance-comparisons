package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_303 {
    private final Production92_303 production = new Production92_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}