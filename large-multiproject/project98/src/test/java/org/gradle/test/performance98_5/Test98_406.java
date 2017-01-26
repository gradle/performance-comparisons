package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_406 {
    private final Production98_406 production = new Production98_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}