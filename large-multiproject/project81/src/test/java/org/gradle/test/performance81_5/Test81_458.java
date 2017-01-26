package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_458 {
    private final Production81_458 production = new Production81_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}