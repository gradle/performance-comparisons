package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_303 {
    private final Production30_303 production = new Production30_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}