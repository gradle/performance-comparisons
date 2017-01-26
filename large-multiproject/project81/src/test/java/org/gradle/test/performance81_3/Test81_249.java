package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_249 {
    private final Production81_249 production = new Production81_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}