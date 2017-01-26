package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_7 {
    private final Production81_7 production = new Production81_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}