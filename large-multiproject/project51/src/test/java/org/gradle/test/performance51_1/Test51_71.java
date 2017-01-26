package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_71 {
    private final Production51_71 production = new Production51_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}