package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_200 {
    private final Production15_200 production = new Production15_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}