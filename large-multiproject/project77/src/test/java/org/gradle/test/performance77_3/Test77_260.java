package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_260 {
    private final Production77_260 production = new Production77_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}