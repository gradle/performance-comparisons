package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_338 {
    private final Production25_338 production = new Production25_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}