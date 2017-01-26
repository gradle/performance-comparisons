package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_251 {
    private final Production81_251 production = new Production81_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}