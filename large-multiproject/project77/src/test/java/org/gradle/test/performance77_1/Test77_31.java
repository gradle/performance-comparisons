package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_31 {
    private final Production77_31 production = new Production77_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}