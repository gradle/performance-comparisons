package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_330 {
    private final Production81_330 production = new Production81_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}