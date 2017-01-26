package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_87 {
    private final Production77_87 production = new Production77_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}