package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_288 {
    private final Production81_288 production = new Production81_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}