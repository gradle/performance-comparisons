package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_58 {
    private final Production81_58 production = new Production81_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}