package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_290 {
    private final Production51_290 production = new Production51_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}