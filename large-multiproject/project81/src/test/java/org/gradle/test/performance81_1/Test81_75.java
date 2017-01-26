package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_75 {
    private final Production81_75 production = new Production81_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}