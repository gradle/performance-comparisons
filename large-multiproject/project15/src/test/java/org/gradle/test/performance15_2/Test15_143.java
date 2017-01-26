package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_143 {
    private final Production15_143 production = new Production15_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}