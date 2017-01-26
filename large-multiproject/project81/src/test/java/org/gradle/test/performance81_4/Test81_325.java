package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_325 {
    private final Production81_325 production = new Production81_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}