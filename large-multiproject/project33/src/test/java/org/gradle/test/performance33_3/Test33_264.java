package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_264 {
    private final Production33_264 production = new Production33_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}