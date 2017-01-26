package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_305 {
    private final Production15_305 production = new Production15_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}