package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_371 {
    private final Production51_371 production = new Production51_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}