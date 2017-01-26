package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_268 {
    private final Production51_268 production = new Production51_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}