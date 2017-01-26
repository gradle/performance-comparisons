package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_347 {
    private final Production25_347 production = new Production25_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}