package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_162 {
    private final Production15_162 production = new Production15_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}