package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_300 {
    private final Production51_300 production = new Production51_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}