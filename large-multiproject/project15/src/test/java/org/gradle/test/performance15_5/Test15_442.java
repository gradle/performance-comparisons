package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_442 {
    private final Production15_442 production = new Production15_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}