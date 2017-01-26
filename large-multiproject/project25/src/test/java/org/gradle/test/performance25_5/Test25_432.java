package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_432 {
    private final Production25_432 production = new Production25_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}