package org.gradle.test.performance25_2;

import static org.junit.Assert.*;

public class Test25_102 {
    private final Production25_102 production = new Production25_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}