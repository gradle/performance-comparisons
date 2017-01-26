package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_172 {
    private final Production25_172 production = new Production25_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}