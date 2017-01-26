package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_207 {
    private final Production40_207 production = new Production40_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}