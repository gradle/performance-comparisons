package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_361 {
    private final Production77_361 production = new Production77_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}