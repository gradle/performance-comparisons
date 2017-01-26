package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_137 {
    private final Production15_137 production = new Production15_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}