package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_435 {
    private final Production85_435 production = new Production85_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}