package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_147 {
    private final Production81_147 production = new Production81_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}