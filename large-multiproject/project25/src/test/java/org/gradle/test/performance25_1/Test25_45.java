package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_45 {
    private final Production25_45 production = new Production25_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}