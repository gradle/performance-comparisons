package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_26 {
    private final Production77_26 production = new Production77_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}