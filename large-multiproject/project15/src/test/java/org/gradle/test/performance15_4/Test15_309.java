package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_309 {
    private final Production15_309 production = new Production15_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}