package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_488 {
    private final Production51_488 production = new Production51_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}