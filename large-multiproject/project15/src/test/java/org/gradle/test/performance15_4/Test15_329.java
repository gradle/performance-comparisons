package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_329 {
    private final Production15_329 production = new Production15_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}