package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_112 {
    private final Production85_112 production = new Production85_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}