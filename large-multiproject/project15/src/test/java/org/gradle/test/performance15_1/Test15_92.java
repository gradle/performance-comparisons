package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_92 {
    private final Production15_92 production = new Production15_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}