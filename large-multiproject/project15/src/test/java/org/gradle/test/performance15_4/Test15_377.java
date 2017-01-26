package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_377 {
    private final Production15_377 production = new Production15_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}