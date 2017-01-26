package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_406 {
    private final Production4_406 production = new Production4_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}