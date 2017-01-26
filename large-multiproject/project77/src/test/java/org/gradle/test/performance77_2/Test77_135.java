package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_135 {
    private final Production77_135 production = new Production77_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}