package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_15 {
    private final Production85_15 production = new Production85_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}