package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_225 {
    private final Production81_225 production = new Production81_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}