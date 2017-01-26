package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_267 {
    private final Production81_267 production = new Production81_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}