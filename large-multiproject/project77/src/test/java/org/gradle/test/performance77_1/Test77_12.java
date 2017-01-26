package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_12 {
    private final Production77_12 production = new Production77_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}