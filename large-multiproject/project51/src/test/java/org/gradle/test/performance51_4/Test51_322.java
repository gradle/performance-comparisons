package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_322 {
    private final Production51_322 production = new Production51_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}