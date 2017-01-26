package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_186 {
    private final Production81_186 production = new Production81_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}