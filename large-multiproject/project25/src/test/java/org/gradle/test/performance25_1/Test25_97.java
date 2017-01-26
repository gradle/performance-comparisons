package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_97 {
    private final Production25_97 production = new Production25_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}