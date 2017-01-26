package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_26 {
    private final Production15_26 production = new Production15_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}