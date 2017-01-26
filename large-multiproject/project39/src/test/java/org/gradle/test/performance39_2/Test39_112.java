package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_112 {
    private final Production39_112 production = new Production39_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}