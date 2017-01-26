package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_266 {
    private final Production81_266 production = new Production81_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}