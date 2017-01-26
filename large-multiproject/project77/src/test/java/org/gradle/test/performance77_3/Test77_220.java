package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_220 {
    private final Production77_220 production = new Production77_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}