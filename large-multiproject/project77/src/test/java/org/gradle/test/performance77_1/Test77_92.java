package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_92 {
    private final Production77_92 production = new Production77_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}