package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_64 {
    private final Production51_64 production = new Production51_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}