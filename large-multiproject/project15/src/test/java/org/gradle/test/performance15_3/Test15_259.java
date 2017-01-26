package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_259 {
    private final Production15_259 production = new Production15_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}