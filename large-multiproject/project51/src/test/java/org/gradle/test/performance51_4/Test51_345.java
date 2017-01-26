package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_345 {
    private final Production51_345 production = new Production51_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}