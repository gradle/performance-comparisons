package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_99 {
    private final Production51_99 production = new Production51_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}