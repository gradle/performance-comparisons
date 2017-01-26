package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_163 {
    private final Production15_163 production = new Production15_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}