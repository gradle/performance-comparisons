package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_474 {
    private final Production85_474 production = new Production85_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}