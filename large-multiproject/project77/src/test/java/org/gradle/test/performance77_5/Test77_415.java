package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_415 {
    private final Production77_415 production = new Production77_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}