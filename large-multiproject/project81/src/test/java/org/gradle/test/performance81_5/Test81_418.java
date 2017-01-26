package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_418 {
    private final Production81_418 production = new Production81_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}