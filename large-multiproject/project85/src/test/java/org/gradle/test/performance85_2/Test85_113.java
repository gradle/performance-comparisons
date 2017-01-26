package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_113 {
    private final Production85_113 production = new Production85_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}