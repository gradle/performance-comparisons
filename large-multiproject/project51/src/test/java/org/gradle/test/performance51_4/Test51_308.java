package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_308 {
    private final Production51_308 production = new Production51_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}