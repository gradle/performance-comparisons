package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_186 {
    private final Production15_186 production = new Production15_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}