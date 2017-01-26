package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_337 {
    private final Production15_337 production = new Production15_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}