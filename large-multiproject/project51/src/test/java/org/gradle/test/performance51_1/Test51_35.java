package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_35 {
    private final Production51_35 production = new Production51_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}