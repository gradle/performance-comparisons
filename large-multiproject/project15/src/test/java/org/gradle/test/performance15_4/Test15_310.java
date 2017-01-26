package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_310 {
    private final Production15_310 production = new Production15_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}