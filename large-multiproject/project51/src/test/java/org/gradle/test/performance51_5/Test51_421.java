package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_421 {
    private final Production51_421 production = new Production51_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}