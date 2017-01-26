package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_468 {
    private final Production51_468 production = new Production51_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}