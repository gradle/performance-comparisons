package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_229 {
    private final Production25_229 production = new Production25_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}