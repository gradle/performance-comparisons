package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_390 {
    private final Production77_390 production = new Production77_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}