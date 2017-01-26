package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_338 {
    private final Production77_338 production = new Production77_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}