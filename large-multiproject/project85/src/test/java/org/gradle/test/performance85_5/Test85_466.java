package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_466 {
    private final Production85_466 production = new Production85_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}