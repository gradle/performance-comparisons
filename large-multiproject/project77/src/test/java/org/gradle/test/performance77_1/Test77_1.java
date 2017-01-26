package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_1 {
    private final Production77_1 production = new Production77_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}