package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_358 {
    private final Production77_358 production = new Production77_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}