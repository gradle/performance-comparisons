package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_71 {
    private final Production81_71 production = new Production81_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}