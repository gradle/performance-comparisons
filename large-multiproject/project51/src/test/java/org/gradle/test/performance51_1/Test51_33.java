package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_33 {
    private final Production51_33 production = new Production51_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}