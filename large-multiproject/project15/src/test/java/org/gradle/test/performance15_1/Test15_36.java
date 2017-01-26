package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_36 {
    private final Production15_36 production = new Production15_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}