package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_166 {
    private final Production81_166 production = new Production81_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}