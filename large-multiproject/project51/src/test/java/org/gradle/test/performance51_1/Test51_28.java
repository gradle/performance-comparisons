package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_28 {
    private final Production51_28 production = new Production51_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}