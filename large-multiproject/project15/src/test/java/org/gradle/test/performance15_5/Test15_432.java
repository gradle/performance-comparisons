package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_432 {
    private final Production15_432 production = new Production15_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}