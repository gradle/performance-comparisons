package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_12 {
    private final Production81_12 production = new Production81_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}