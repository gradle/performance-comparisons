package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_12 {
    private final Production51_12 production = new Production51_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}