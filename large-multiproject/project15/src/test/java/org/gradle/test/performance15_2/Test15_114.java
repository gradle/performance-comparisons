package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_114 {
    private final Production15_114 production = new Production15_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}