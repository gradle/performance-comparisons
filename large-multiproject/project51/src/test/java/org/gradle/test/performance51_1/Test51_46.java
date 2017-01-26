package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_46 {
    private final Production51_46 production = new Production51_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}