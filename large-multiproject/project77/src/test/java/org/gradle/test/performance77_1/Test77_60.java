package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_60 {
    private final Production77_60 production = new Production77_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}