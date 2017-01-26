package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_163 {
    private final Production77_163 production = new Production77_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}