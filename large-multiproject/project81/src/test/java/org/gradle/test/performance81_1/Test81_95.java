package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_95 {
    private final Production81_95 production = new Production81_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}