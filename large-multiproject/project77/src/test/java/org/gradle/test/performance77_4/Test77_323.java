package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_323 {
    private final Production77_323 production = new Production77_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}