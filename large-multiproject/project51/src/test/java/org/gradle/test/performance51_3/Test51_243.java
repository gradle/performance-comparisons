package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_243 {
    private final Production51_243 production = new Production51_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}