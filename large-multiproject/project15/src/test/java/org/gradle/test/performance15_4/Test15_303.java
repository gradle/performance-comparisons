package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_303 {
    private final Production15_303 production = new Production15_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}