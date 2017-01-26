package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_156 {
    private final Production77_156 production = new Production77_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}