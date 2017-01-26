package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_98 {
    private final Production77_98 production = new Production77_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}