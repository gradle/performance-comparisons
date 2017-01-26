package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_362 {
    private final Production77_362 production = new Production77_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}