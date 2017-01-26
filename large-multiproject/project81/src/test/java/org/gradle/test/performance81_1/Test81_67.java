package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_67 {
    private final Production81_67 production = new Production81_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}