package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_314 {
    private final Production81_314 production = new Production81_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}