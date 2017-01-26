package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_214 {
    private final Production15_214 production = new Production15_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}