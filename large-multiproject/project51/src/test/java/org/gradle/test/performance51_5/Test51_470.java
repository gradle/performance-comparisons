package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_470 {
    private final Production51_470 production = new Production51_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}