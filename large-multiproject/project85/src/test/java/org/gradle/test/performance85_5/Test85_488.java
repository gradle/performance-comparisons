package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_488 {
    private final Production85_488 production = new Production85_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}