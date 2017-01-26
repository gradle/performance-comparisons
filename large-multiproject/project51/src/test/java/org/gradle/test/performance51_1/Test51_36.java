package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_36 {
    private final Production51_36 production = new Production51_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}