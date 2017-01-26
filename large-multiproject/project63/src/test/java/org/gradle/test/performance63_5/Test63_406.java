package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_406 {
    private final Production63_406 production = new Production63_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}