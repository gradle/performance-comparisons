package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_300 {
    private final Production77_300 production = new Production77_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}