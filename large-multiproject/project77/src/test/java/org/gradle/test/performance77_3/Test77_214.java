package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_214 {
    private final Production77_214 production = new Production77_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}