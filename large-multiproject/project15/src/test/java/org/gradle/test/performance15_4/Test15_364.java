package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_364 {
    private final Production15_364 production = new Production15_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}