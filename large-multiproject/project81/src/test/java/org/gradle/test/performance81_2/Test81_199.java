package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_199 {
    private final Production81_199 production = new Production81_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}