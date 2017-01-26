package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_105 {
    private final Production85_105 production = new Production85_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}