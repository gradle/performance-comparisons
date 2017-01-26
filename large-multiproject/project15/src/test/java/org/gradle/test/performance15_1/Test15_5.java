package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_5 {
    private final Production15_5 production = new Production15_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}