package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_31 {
    private final Production51_31 production = new Production51_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}