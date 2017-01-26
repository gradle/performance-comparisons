package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_264 {
    private final Production64_264 production = new Production64_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}