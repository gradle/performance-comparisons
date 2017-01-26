package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_474 {
    private final Production77_474 production = new Production77_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}