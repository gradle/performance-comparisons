package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_479 {
    private final Production51_479 production = new Production51_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}