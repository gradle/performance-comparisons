package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_267 {
    private final Production25_267 production = new Production25_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}