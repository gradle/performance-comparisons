package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_371 {
    private final Production85_371 production = new Production85_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}