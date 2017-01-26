package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_220 {
    private final Production81_220 production = new Production81_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}