package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_358 {
    private final Production15_358 production = new Production15_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}