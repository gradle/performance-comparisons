package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_109 {
    private final Production51_109 production = new Production51_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}