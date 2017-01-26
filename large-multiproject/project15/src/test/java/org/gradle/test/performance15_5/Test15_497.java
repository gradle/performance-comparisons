package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_497 {
    private final Production15_497 production = new Production15_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}