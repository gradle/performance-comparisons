package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_307 {
    private final Production15_307 production = new Production15_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}