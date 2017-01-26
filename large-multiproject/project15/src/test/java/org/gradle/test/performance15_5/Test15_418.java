package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_418 {
    private final Production15_418 production = new Production15_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}