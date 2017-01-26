package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_422 {
    private final Production77_422 production = new Production77_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}