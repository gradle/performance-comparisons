package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_140 {
    private final Production51_140 production = new Production51_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}