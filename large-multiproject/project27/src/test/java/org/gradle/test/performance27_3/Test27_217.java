package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_217 {
    private final Production27_217 production = new Production27_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}