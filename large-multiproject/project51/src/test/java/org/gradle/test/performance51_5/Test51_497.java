package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_497 {
    private final Production51_497 production = new Production51_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}