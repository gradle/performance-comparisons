package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_293 {
    private final Production15_293 production = new Production15_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}