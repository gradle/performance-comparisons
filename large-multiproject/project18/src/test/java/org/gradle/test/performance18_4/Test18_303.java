package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_303 {
    private final Production18_303 production = new Production18_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}