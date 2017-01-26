package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_127 {
    private final Production51_127 production = new Production51_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}