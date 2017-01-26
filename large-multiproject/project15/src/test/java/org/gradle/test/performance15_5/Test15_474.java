package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_474 {
    private final Production15_474 production = new Production15_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}