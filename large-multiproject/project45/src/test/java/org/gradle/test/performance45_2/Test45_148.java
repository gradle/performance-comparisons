package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_148 {
    private final Production45_148 production = new Production45_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}