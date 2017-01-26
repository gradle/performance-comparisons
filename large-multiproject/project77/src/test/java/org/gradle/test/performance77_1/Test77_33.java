package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_33 {
    private final Production77_33 production = new Production77_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}