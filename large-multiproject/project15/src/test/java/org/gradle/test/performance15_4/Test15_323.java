package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_323 {
    private final Production15_323 production = new Production15_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}