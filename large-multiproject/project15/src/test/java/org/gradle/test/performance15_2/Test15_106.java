package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_106 {
    private final Production15_106 production = new Production15_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}