package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_42 {
    private final Production51_42 production = new Production51_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}