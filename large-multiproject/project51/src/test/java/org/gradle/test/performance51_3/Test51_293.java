package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_293 {
    private final Production51_293 production = new Production51_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}