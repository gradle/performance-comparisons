package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_8 {
    private final Production77_8 production = new Production77_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}