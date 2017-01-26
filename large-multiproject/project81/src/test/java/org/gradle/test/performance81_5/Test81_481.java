package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_481 {
    private final Production81_481 production = new Production81_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}