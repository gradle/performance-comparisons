package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_413 {
    private final Production51_413 production = new Production51_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}