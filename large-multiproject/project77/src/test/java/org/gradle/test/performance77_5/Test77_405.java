package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_405 {
    private final Production77_405 production = new Production77_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}