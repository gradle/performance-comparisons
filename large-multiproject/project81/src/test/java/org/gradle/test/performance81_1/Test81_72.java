package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_72 {
    private final Production81_72 production = new Production81_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}