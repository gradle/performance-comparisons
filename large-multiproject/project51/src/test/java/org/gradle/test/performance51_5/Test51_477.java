package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_477 {
    private final Production51_477 production = new Production51_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}