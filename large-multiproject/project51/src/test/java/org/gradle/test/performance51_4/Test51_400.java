package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_400 {
    private final Production51_400 production = new Production51_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}