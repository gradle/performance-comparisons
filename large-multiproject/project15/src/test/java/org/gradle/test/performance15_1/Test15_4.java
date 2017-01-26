package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_4 {
    private final Production15_4 production = new Production15_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}