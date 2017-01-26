package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_171 {
    private final Production15_171 production = new Production15_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}