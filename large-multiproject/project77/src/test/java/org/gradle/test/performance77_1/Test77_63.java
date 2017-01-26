package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_63 {
    private final Production77_63 production = new Production77_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}