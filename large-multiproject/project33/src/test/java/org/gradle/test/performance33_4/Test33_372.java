package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_372 {
    private final Production33_372 production = new Production33_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}