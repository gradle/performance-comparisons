package org.gradle.test.performance11_4;

import static org.junit.Assert.*;

public class Test11_314 {
    private final Production11_314 production = new Production11_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}