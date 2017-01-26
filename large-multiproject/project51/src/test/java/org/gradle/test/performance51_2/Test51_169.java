package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_169 {
    private final Production51_169 production = new Production51_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}