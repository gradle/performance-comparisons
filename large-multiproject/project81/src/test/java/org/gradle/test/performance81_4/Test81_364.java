package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_364 {
    private final Production81_364 production = new Production81_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}