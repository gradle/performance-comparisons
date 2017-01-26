package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_464 {
    private final Production51_464 production = new Production51_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}