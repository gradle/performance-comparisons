package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_373 {
    private final Production51_373 production = new Production51_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}