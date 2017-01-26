package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_148 {
    private final Production73_148 production = new Production73_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}