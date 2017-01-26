package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_212 {
    private final Production81_212 production = new Production81_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}