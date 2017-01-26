package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_81 {
    private final Production77_81 production = new Production77_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}