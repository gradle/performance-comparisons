package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_382 {
    private final Production81_382 production = new Production81_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}