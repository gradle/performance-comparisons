package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_392 {
    private final Production81_392 production = new Production81_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}