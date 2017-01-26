package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_406 {
    private final Production89_406 production = new Production89_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}