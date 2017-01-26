package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_228 {
    private final Production81_228 production = new Production81_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}