package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_202 {
    private final Production81_202 production = new Production81_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}