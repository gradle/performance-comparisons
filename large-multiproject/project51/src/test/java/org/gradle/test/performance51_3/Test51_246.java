package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_246 {
    private final Production51_246 production = new Production51_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}