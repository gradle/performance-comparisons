package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_53 {
    private final Production77_53 production = new Production77_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}