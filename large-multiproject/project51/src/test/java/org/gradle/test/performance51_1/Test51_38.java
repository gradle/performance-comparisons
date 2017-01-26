package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_38 {
    private final Production51_38 production = new Production51_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}