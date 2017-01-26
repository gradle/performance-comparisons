package org.gradle.test.performance57_4;

import static org.junit.Assert.*;

public class Test57_314 {
    private final Production57_314 production = new Production57_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}