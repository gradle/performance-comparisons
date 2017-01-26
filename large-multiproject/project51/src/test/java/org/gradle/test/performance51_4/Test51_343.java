package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_343 {
    private final Production51_343 production = new Production51_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}