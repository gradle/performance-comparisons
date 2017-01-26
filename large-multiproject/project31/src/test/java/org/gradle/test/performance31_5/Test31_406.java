package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_406 {
    private final Production31_406 production = new Production31_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}