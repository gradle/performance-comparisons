package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_109 {
    private final Production15_109 production = new Production15_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}