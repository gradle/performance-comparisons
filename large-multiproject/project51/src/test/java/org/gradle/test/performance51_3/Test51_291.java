package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_291 {
    private final Production51_291 production = new Production51_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}