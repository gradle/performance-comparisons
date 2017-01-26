package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_471 {
    private final Production51_471 production = new Production51_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}