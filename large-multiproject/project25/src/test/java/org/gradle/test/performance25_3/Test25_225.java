package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_225 {
    private final Production25_225 production = new Production25_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}