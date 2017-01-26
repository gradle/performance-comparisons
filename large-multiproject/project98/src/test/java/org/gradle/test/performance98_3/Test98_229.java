package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_229 {
    private final Production98_229 production = new Production98_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}