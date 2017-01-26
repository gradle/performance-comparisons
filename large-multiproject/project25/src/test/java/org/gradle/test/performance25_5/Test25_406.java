package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_406 {
    private final Production25_406 production = new Production25_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}