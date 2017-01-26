package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_406 {
    private final Production35_406 production = new Production35_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}