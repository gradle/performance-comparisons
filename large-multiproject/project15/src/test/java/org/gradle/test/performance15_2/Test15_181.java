package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_181 {
    private final Production15_181 production = new Production15_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}