package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_282 {
    private final Production81_282 production = new Production81_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}