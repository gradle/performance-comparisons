package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_382 {
    private final Production77_382 production = new Production77_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}