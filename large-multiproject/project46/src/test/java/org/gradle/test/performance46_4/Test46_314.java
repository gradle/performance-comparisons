package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_314 {
    private final Production46_314 production = new Production46_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}