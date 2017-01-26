package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_259 {
    private final Production81_259 production = new Production81_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}