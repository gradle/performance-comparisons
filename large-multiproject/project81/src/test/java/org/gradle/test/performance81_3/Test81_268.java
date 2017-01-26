package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_268 {
    private final Production81_268 production = new Production81_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}