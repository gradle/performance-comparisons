package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_259 {
    private final Production51_259 production = new Production51_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}