package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_168 {
    private final Production77_168 production = new Production77_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}