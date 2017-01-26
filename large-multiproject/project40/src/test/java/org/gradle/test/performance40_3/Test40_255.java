package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_255 {
    private final Production40_255 production = new Production40_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}