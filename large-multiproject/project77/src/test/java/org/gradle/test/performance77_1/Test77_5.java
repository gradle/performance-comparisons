package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_5 {
    private final Production77_5 production = new Production77_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}