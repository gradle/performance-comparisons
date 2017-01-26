package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_246 {
    private final Production81_246 production = new Production81_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}