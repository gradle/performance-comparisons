package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_231 {
    private final Production81_231 production = new Production81_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}