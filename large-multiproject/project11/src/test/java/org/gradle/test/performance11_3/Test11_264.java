package org.gradle.test.performance11_3;

import static org.junit.Assert.*;

public class Test11_264 {
    private final Production11_264 production = new Production11_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}