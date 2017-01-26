package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_310 {
    private final Production51_310 production = new Production51_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}