package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_314 {
    private final Production17_314 production = new Production17_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}