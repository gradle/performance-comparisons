package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_307 {
    private final Production77_307 production = new Production77_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}