package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_54 {
    private final Production77_54 production = new Production77_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}