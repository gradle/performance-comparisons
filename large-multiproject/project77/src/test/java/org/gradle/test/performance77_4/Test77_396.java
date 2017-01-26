package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_396 {
    private final Production77_396 production = new Production77_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}