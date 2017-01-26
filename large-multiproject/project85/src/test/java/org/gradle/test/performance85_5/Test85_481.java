package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_481 {
    private final Production85_481 production = new Production85_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}