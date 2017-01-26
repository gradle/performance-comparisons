package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_466 {
    private final Production15_466 production = new Production15_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}