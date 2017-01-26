package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_272 {
    private final Production85_272 production = new Production85_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}