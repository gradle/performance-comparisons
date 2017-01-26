package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_47 {
    private final Production81_47 production = new Production81_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}