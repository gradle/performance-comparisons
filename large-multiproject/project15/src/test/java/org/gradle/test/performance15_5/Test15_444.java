package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_444 {
    private final Production15_444 production = new Production15_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}