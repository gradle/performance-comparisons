package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_161 {
    private final Production77_161 production = new Production77_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}