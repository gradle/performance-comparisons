package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_196 {
    private final Production77_196 production = new Production77_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}