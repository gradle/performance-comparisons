package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_73 {
    private final Production40_73 production = new Production40_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}