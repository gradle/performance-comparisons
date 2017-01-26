package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_308 {
    private final Production19_308 production = new Production19_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}