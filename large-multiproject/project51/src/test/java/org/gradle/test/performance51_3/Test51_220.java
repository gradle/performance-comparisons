package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_220 {
    private final Production51_220 production = new Production51_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}