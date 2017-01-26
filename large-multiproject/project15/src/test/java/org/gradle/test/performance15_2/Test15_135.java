package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_135 {
    private final Production15_135 production = new Production15_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}