package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_406 {
    private final Production48_406 production = new Production48_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}