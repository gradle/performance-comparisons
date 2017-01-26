package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_40 {
    private final Production25_40 production = new Production25_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}