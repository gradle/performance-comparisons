package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_134 {
    private final Production51_134 production = new Production51_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}