package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_81 {
    private final Production81_81 production = new Production81_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}