package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_405 {
    private final Production51_405 production = new Production51_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}