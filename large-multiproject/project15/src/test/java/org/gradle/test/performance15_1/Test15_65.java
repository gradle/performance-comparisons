package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_65 {
    private final Production15_65 production = new Production15_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}