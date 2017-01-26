package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_100 {
    private final Production15_100 production = new Production15_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}