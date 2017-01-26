package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_320 {
    private final Production15_320 production = new Production15_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}