package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_419 {
    private final Production15_419 production = new Production15_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}