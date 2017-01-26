package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_19 {
    private final Production51_19 production = new Production51_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}