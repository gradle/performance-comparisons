package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_97 {
    private final Production81_97 production = new Production81_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}