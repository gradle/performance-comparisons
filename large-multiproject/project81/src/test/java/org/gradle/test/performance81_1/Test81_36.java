package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_36 {
    private final Production81_36 production = new Production81_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}