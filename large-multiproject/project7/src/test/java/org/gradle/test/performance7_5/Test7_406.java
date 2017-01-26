package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_406 {
    private final Production7_406 production = new Production7_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}