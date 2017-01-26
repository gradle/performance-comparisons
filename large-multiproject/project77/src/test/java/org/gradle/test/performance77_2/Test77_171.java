package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_171 {
    private final Production77_171 production = new Production77_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}