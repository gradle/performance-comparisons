package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_212 {
    private final Production77_212 production = new Production77_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}