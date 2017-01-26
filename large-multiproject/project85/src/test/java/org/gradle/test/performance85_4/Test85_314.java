package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_314 {
    private final Production85_314 production = new Production85_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}