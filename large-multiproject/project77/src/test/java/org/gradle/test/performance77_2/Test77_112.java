package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_112 {
    private final Production77_112 production = new Production77_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}