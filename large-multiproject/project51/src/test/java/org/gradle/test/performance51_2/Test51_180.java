package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_180 {
    private final Production51_180 production = new Production51_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}