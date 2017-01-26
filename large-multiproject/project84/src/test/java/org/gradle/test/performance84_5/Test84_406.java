package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_406 {
    private final Production84_406 production = new Production84_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}