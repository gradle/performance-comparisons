package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_182 {
    private final Production51_182 production = new Production51_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}