package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_74 {
    private final Production51_74 production = new Production51_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}