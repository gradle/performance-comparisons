package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_314 {
    private final Production64_314 production = new Production64_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}