package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_435 {
    private final Production77_435 production = new Production77_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}