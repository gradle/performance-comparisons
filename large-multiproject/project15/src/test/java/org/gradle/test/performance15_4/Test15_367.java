package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_367 {
    private final Production15_367 production = new Production15_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}