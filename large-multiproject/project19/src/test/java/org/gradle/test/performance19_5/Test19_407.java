package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_407 {
    private final Production19_407 production = new Production19_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}