package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_436 {
    private final Production51_436 production = new Production51_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}