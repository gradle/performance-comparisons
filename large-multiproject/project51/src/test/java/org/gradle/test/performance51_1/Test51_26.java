package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_26 {
    private final Production51_26 production = new Production51_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}