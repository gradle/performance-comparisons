package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_303 {
    private final Production37_303 production = new Production37_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}