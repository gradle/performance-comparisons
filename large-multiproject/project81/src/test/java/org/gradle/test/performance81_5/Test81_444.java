package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_444 {
    private final Production81_444 production = new Production81_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}