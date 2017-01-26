package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_303 {
    private final Production10_303 production = new Production10_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}