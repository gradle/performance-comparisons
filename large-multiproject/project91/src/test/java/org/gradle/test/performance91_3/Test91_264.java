package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_264 {
    private final Production91_264 production = new Production91_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}