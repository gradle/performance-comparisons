package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_8 {
    private final Production51_8 production = new Production51_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}