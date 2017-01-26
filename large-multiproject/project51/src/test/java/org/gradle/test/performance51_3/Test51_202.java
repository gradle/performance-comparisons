package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_202 {
    private final Production51_202 production = new Production51_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}