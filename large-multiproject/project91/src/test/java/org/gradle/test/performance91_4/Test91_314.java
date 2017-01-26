package org.gradle.test.performance91_4;

import static org.junit.Assert.*;

public class Test91_314 {
    private final Production91_314 production = new Production91_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}