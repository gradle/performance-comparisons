package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_373 {
    private final Production77_373 production = new Production77_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}