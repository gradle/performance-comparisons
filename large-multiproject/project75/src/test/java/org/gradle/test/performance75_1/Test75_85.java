package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_85 {
    private final Production75_85 production = new Production75_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}