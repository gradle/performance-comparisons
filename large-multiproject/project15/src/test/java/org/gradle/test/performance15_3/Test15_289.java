package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_289 {
    private final Production15_289 production = new Production15_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}