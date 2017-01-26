package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_406 {
    private final Production92_406 production = new Production92_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}