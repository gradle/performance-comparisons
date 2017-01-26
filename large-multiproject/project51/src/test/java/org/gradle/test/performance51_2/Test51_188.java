package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_188 {
    private final Production51_188 production = new Production51_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}