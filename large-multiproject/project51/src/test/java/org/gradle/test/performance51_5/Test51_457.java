package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_457 {
    private final Production51_457 production = new Production51_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}