package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_450 {
    private final Production77_450 production = new Production77_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}