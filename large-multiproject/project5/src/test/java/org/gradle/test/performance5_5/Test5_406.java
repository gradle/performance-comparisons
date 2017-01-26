package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_406 {
    private final Production5_406 production = new Production5_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}