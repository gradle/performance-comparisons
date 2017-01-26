package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_62 {
    private final Production77_62 production = new Production77_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}