package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_241 {
    private final Production77_241 production = new Production77_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}