package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_314 {
    private final Production42_314 production = new Production42_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}