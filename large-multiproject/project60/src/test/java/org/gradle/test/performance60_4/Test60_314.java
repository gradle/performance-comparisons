package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_314 {
    private final Production60_314 production = new Production60_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}