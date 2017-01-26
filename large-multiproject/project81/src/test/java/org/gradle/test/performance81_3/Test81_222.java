package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_222 {
    private final Production81_222 production = new Production81_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}