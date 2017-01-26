package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_406 {
    private final Production58_406 production = new Production58_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}