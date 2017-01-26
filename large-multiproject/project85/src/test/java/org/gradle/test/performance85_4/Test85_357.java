package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_357 {
    private final Production85_357 production = new Production85_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}