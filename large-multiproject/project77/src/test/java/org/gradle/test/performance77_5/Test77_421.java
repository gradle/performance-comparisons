package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_421 {
    private final Production77_421 production = new Production77_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}