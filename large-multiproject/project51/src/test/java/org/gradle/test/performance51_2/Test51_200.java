package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_200 {
    private final Production51_200 production = new Production51_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}