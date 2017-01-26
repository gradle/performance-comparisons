package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_424 {
    private final Production51_424 production = new Production51_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}