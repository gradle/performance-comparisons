package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_466 {
    private final Production81_466 production = new Production81_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}