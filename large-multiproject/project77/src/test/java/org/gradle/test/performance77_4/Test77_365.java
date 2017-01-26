package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_365 {
    private final Production77_365 production = new Production77_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}