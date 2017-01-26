package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_294 {
    private final Production25_294 production = new Production25_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}