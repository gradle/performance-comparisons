package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_49 {
    private final Production81_49 production = new Production81_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}