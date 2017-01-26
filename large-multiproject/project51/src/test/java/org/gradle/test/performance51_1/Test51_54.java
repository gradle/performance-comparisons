package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_54 {
    private final Production51_54 production = new Production51_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}