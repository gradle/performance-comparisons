package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_5 {
    private final Production81_5 production = new Production81_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}