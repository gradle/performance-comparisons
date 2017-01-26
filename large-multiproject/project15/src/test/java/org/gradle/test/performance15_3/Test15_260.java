package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_260 {
    private final Production15_260 production = new Production15_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}