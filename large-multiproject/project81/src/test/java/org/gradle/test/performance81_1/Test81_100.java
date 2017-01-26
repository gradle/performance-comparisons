package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_100 {
    private final Production81_100 production = new Production81_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}