package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_343 {
    private final Production85_343 production = new Production85_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}