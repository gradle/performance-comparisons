package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_7 {
    private final Production15_7 production = new Production15_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}