package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_112 {
    private final Production81_112 production = new Production81_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}