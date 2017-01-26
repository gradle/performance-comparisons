package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_361 {
    private final Production81_361 production = new Production81_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}