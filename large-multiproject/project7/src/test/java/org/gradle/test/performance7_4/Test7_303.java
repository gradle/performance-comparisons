package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_303 {
    private final Production7_303 production = new Production7_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}