package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_317 {
    private final Production77_317 production = new Production77_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}