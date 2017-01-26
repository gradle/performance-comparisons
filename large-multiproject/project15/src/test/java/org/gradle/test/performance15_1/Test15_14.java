package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_14 {
    private final Production15_14 production = new Production15_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}