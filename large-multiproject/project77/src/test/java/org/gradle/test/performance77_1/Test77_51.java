package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_51 {
    private final Production77_51 production = new Production77_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}