package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_74 {
    private final Production15_74 production = new Production15_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}