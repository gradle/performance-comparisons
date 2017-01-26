package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_200 {
    private final Production77_200 production = new Production77_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}