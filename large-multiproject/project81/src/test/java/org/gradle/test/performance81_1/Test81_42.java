package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_42 {
    private final Production81_42 production = new Production81_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}