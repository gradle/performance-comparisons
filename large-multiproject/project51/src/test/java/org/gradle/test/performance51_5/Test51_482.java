package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_482 {
    private final Production51_482 production = new Production51_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}