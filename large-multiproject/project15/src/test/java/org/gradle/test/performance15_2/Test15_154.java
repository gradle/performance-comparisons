package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_154 {
    private final Production15_154 production = new Production15_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}