package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_406 {
    private final Production77_406 production = new Production77_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}