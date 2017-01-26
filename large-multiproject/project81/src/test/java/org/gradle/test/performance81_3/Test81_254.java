package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_254 {
    private final Production81_254 production = new Production81_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}