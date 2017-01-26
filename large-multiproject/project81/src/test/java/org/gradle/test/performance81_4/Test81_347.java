package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_347 {
    private final Production81_347 production = new Production81_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}