package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_47 {
    private final Production77_47 production = new Production77_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}