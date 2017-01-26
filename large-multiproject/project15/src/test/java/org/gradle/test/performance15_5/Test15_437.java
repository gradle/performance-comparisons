package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_437 {
    private final Production15_437 production = new Production15_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}