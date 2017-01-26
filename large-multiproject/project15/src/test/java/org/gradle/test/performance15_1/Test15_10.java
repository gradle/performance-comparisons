package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_10 {
    private final Production15_10 production = new Production15_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}