package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_313 {
    private final Production51_313 production = new Production51_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}