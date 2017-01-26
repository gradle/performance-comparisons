package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_406 {
    private final Production80_406 production = new Production80_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}