package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_66 {
    private final Production81_66 production = new Production81_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}