package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_500 {
    private final Production77_500 production = new Production77_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}