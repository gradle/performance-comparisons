package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_81 {
    private final Production15_81 production = new Production15_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}