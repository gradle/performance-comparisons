package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_320 {
    private final Production77_320 production = new Production77_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}