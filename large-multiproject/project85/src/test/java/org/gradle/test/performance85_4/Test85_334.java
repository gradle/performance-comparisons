package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_334 {
    private final Production85_334 production = new Production85_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}