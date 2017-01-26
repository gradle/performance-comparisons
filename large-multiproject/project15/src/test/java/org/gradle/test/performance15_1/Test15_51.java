package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_51 {
    private final Production15_51 production = new Production15_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}