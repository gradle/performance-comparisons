package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_206 {
    private final Production85_206 production = new Production85_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}