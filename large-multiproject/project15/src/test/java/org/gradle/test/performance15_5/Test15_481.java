package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_481 {
    private final Production15_481 production = new Production15_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}