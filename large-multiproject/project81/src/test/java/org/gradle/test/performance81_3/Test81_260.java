package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_260 {
    private final Production81_260 production = new Production81_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}