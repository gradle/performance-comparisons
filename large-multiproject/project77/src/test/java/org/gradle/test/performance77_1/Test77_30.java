package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_30 {
    private final Production77_30 production = new Production77_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}