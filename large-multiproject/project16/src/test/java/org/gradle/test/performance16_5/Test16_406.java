package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_406 {
    private final Production16_406 production = new Production16_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}