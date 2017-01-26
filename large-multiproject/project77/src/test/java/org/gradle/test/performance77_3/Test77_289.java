package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_289 {
    private final Production77_289 production = new Production77_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}