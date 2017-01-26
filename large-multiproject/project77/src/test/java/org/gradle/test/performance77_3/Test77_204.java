package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_204 {
    private final Production77_204 production = new Production77_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}