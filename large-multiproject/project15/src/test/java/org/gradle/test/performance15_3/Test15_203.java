package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_203 {
    private final Production15_203 production = new Production15_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}