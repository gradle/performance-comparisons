package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_162 {
    private final Production51_162 production = new Production51_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}