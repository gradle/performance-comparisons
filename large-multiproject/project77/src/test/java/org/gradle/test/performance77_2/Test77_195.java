package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_195 {
    private final Production77_195 production = new Production77_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}