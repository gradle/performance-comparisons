package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_303 {
    private final Production81_303 production = new Production81_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}