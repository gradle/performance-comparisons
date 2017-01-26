package org.gradle.test.performance59_3;

import static org.junit.Assert.*;

public class Test59_264 {
    private final Production59_264 production = new Production59_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}