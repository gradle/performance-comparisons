package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_138 {
    private final Production15_138 production = new Production15_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}