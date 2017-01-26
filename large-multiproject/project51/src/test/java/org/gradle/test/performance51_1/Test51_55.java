package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_55 {
    private final Production51_55 production = new Production51_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}