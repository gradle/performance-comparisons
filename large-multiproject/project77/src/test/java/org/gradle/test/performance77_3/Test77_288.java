package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_288 {
    private final Production77_288 production = new Production77_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}