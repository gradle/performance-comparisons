package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_403 {
    private final Production51_403 production = new Production51_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}