package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_157 {
    private final Production81_157 production = new Production81_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}