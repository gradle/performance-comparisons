package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_377 {
    private final Production27_377 production = new Production27_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}