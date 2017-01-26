package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_286 {
    private final Production81_286 production = new Production81_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}