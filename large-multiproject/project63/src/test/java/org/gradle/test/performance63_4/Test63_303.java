package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_303 {
    private final Production63_303 production = new Production63_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}