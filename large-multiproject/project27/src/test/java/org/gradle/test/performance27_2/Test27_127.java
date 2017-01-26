package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_127 {
    private final Production27_127 production = new Production27_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}