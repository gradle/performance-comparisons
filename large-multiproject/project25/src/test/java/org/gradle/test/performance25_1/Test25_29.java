package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_29 {
    private final Production25_29 production = new Production25_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}