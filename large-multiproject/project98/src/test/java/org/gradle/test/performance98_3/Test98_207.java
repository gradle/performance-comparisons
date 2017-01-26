package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_207 {
    private final Production98_207 production = new Production98_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}