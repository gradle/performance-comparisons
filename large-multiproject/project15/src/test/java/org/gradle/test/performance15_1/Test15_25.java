package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_25 {
    private final Production15_25 production = new Production15_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}