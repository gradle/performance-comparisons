package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_243 {
    private final Production15_243 production = new Production15_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}