package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_109 {
    private final Production77_109 production = new Production77_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}