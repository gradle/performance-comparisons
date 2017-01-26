package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_225 {
    private final Production98_225 production = new Production98_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}