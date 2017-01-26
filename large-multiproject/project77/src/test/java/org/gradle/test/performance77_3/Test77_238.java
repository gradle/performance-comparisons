package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_238 {
    private final Production77_238 production = new Production77_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}