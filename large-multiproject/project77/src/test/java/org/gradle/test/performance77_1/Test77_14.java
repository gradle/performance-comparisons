package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_14 {
    private final Production77_14 production = new Production77_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}