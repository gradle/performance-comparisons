package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_314 {
    private final Production65_314 production = new Production65_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}