package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_305 {
    private final Production77_305 production = new Production77_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}