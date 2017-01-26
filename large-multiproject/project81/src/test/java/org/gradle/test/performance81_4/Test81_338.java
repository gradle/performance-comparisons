package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_338 {
    private final Production81_338 production = new Production81_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}