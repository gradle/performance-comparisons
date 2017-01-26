package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_187 {
    private final Production77_187 production = new Production77_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}