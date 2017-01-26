package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_147 {
    private final Production51_147 production = new Production51_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}