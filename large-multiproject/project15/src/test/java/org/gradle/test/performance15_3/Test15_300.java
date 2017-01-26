package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_300 {
    private final Production15_300 production = new Production15_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}