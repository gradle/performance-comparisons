package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_309 {
    private final Production77_309 production = new Production77_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}