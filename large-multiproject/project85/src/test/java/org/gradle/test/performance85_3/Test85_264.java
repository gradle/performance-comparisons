package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_264 {
    private final Production85_264 production = new Production85_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}