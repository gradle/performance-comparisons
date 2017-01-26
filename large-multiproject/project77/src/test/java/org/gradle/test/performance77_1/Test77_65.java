package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_65 {
    private final Production77_65 production = new Production77_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}