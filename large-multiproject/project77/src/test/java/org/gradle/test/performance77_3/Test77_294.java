package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_294 {
    private final Production77_294 production = new Production77_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}