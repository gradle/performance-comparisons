package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_175 {
    private final Production77_175 production = new Production77_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}