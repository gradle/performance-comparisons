package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_210 {
    private final Production15_210 production = new Production15_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}