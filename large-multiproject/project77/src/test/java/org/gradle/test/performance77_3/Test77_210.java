package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_210 {
    private final Production77_210 production = new Production77_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}