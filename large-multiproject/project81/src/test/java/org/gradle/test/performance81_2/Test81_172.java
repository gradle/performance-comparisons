package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_172 {
    private final Production81_172 production = new Production81_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}