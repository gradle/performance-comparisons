package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_396 {
    private final Production51_396 production = new Production51_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}