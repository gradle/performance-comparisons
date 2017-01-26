package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_264 {
    private final Production51_264 production = new Production51_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}