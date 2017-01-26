package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_59 {
    private final Production51_59 production = new Production51_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}