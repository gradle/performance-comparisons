package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_264 {
    private final Production60_264 production = new Production60_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}