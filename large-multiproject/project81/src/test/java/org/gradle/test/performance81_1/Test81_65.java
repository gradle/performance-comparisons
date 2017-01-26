package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_65 {
    private final Production81_65 production = new Production81_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}