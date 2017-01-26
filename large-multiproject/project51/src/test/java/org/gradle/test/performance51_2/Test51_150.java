package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_150 {
    private final Production51_150 production = new Production51_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}