package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_82 {
    private final Production81_82 production = new Production81_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}