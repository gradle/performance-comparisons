package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_406 {
    private final Production8_406 production = new Production8_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}