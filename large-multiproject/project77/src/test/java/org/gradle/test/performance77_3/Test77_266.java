package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_266 {
    private final Production77_266 production = new Production77_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}