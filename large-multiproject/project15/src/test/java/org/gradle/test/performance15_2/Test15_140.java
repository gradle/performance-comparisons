package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_140 {
    private final Production15_140 production = new Production15_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}