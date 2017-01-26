package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_492 {
    private final Production51_492 production = new Production51_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}