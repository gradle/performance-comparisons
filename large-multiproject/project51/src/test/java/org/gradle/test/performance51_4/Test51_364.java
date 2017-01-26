package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_364 {
    private final Production51_364 production = new Production51_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}