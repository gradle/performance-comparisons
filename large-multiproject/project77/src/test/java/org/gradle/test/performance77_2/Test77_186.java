package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_186 {
    private final Production77_186 production = new Production77_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}