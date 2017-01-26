package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_423 {
    private final Production15_423 production = new Production15_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}