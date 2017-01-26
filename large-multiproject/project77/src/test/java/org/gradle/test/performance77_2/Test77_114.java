package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_114 {
    private final Production77_114 production = new Production77_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}