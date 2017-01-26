package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_314 {
    private final Production95_314 production = new Production95_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}