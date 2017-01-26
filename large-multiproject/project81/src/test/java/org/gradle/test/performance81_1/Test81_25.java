package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_25 {
    private final Production81_25 production = new Production81_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}