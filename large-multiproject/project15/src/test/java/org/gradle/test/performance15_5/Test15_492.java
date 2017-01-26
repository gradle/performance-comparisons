package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_492 {
    private final Production15_492 production = new Production15_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}