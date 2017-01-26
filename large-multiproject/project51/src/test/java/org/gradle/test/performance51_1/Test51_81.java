package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_81 {
    private final Production51_81 production = new Production51_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}