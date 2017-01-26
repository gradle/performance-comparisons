package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_270 {
    private final Production85_270 production = new Production85_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}