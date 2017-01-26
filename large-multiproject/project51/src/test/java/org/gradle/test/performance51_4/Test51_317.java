package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_317 {
    private final Production51_317 production = new Production51_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}