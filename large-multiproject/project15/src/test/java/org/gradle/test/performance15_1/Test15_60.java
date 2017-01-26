package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_60 {
    private final Production15_60 production = new Production15_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}