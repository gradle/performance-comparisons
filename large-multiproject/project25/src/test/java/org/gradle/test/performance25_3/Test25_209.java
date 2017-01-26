package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_209 {
    private final Production25_209 production = new Production25_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}