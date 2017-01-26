package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_220 {
    private final Production15_220 production = new Production15_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}