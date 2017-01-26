package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_155 {
    private final Production51_155 production = new Production51_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}