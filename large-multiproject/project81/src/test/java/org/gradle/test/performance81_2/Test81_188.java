package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_188 {
    private final Production81_188 production = new Production81_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}