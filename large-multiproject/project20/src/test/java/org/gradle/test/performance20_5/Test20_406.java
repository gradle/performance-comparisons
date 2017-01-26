package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_406 {
    private final Production20_406 production = new Production20_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}