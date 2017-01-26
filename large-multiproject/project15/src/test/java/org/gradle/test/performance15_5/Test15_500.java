package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_500 {
    private final Production15_500 production = new Production15_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}