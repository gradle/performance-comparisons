package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_249 {
    private final Production77_249 production = new Production77_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}