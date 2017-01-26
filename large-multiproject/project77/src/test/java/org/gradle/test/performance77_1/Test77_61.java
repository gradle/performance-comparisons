package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_61 {
    private final Production77_61 production = new Production77_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}