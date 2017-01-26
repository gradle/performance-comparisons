package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_34 {
    private final Production15_34 production = new Production15_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}