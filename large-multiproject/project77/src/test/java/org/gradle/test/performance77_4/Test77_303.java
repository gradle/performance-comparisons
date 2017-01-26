package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_303 {
    private final Production77_303 production = new Production77_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}