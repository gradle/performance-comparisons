package org.gradle.test.performance34_4;

import static org.junit.Assert.*;

public class Test34_308 {
    private final Production34_308 production = new Production34_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}