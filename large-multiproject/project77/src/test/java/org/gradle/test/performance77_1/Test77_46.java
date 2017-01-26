package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_46 {
    private final Production77_46 production = new Production77_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}