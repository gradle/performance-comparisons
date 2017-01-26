package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_315 {
    private final Production81_315 production = new Production81_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}