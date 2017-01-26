package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_314 {
    private final Production2_314 production = new Production2_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}