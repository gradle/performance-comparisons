package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_258 {
    private final Production85_258 production = new Production85_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}