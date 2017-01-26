package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_95 {
    private final Production51_95 production = new Production51_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}