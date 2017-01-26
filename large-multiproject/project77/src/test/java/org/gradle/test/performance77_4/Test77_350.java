package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_350 {
    private final Production77_350 production = new Production77_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}