package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_458 {
    private final Production77_458 production = new Production77_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}