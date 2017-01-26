package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_288 {
    private final Production25_288 production = new Production25_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}