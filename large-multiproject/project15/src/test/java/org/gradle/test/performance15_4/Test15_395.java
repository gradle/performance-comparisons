package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_395 {
    private final Production15_395 production = new Production15_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}