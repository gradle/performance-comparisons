package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_43 {
    private final Production81_43 production = new Production81_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}