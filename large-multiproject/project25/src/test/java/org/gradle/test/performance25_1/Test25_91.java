package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_91 {
    private final Production25_91 production = new Production25_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}