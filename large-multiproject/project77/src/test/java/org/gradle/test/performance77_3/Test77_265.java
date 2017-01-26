package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_265 {
    private final Production77_265 production = new Production77_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}