package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_244 {
    private final Production15_244 production = new Production15_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}