package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_164 {
    private final Production51_164 production = new Production51_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}