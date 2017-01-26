package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_28 {
    private final Production15_28 production = new Production15_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}